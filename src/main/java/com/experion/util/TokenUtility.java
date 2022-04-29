package com.experion.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TokenUtility {

	private static Logger logger = LoggerFactory.getLogger(TokenUtility.class);
	
	public static void decodeToken(HttpServletRequest request) {
		String token = request.getHeader("Authorization").split("Bearer ")[1];
		String[] split_string = token.split("\\.");
        String base64EncodedHeader = split_string[0];
        String base64EncodedBody = split_string[1];
        Base64 base64Url = new Base64(true);
        String header = new String(base64Url.decode(base64EncodedHeader));
        String body = new String(base64Url.decode(base64EncodedBody));
        logger.info("\nheader: {}\n", header);
        logger.info("\nbody: {}\n", body);
	}
	
}
