//package com.example.chatserver.chat.config;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.*;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.concurrent.ConcurrentHashMap;
//
//
//// connect로 웹소켓 연결이 들어왔을대 이를 처리할 클래스
//@Component
//public class SimpleWebSocketHandler extends TextWebSocketHandler {
//
//    // 연결된 세션 관리 : 쓰레드 safe한 set 사용
//    // ConcurrentHaashMap => 쓰레드 safe함. ( 동시에 여러 사용자가 몰려들어도 문제 없는. )
//    private final Set<WebSocketSession> sessions = ConcurrentHashMap.newKeySet();
//
//    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//        sessions.add(session);
//        System.out.println("Connected::"+session.getId());
//    }
//
//    // 사용자 한테 메시지 보내주는
//    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        String payload = message.getPayload();
//        System.out.println("payload::" + payload);
//
//        for(WebSocketSession s : sessions){
//            // isOpen => 받아 줄 수 있으면
//            if(s.isOpen()){
//
//                //TextMessage라는 형태로 payload를 보내주겠다. (sessions set에 담겨있는 palyeer들에게 모두 메시지를 보내주겠다.)
//                s.sendMessage(new TextMessage(payload));
//            }
//        }
//    }
//
//
//    // 연결이 끊기면
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
//        sessions.remove(session);
//        System.out.println("Disconnected::"+session.getId());
//    }
//
//
//
//}
