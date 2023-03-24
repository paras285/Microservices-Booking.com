package com.nagarro.nagp.usermangamentservice.utils;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtTokenUtil {

	private SecretKey secretKey;

	public JwtTokenUtil() {

//		String secret = "my-secret-key";
//		byte[] secretBytes = secret.getBytes();
//		secretKey = new SecretKeySpec(secretBytes, SignatureAlgorithm.HS256.getJcaName());
		KeyGenerator keyGenerator;
		try {
			keyGenerator = KeyGenerator.getInstance("HmacSHA256");
			keyGenerator.init(256);
			this.secretKey = keyGenerator.generateKey();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("No such algo "+e);
		}
	}

	public String generateToken(String userId) {
		long now = System.currentTimeMillis();
		long validityInMilliseconds = 3600000; // 1 hour

		return Jwts.builder().setSubject(userId).setIssuedAt(new Date(now))
				.setExpiration(new Date(now + validityInMilliseconds)).signWith(secretKey,SignatureAlgorithm.HS256).compact();
	}

	public boolean validateToken(String token) {
		try {
			Claims claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
			System.out.println("Token Validated");
			return true;
		} catch (Exception e) {
			System.out.println("Token Invalid" + e);
			return false;
		}
	}
}
