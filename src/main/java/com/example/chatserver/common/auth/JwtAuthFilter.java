package com.example.chatserver.common.auth;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("🔥 JwtAuthFilter 실행: " + request.getRequestURI());
        filterChain.doFilter(request, response);
        System.out.println("✅ JwtAuthFilter 통과 완료");
    }

}
