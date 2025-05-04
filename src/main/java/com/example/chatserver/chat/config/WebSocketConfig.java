//package com.example.chatserver.chat.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//
//
//
//@Configuration
//@EnableWebSocket
//public class WebSocketConfig implements WebSocketConfigurer {
//
//    private final SimpleWebSocketHandler simpleWebSocketHandler;
//
//    public WebSocketConfig(SimpleWebSocketHandler simpleWebSocketHandler) {
//        this.simpleWebSocketHandler = simpleWebSocketHandler;
//    }
//
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//
//        // connect url로 웹소켓 연결이 들어오면 핸들러 클래스가 처리한다.
//        registry.addHandler(simpleWebSocketHandler, "/connect")
//                // securityconfigs에서의 cors예외는 http요청에 대한 예외. 따라서 webcoscket 프로토콜에 대한 요청에 대해서는 별도의 cors설정 필요.
//                .setAllowedOrigins("http://localhost:3000");  //localhost:3000은 cors 예외처리 해주겠다.
//
//    }
//}
