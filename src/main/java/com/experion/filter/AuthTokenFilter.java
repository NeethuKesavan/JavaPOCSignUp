package com.experion.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.experion.util.TokenUtility;

@Component
public class AuthTokenFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		TokenUtility.decodeToken(request);
//		ObjectMapper mapper = new ObjectMapper();
//		Map<String, Object> map = mapper.readValue(body, Map.class);
//		String email = String.valueOf(map.get("emails")).split(",")[0];
//		email = email.replaceAll("\\[", "").replaceAll("\\]", "");
//		System.out.println(email);
		chain.doFilter(request, response);
	}
}