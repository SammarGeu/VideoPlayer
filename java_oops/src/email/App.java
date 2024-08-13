//package email;
////
////import javax.mail.*;
////import javax.mail.internet.InternetAddress;
////import javax.mail.internet.MimeMessage;
////import java.util.Properties;
////import java.net.Authenticator;
////import java.net.PasswordAuthentication;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import java.util.Properties;
//
//public class App {
//
//
//    public static void main(String[] args) {
//        System.out.println("preparing to send message");
//        String message = "Hello Dear, this is a message for Security Check";
//        String subject = "CodeEra Confirmation";
//        String to = "aannuukkuullssaiinnii0123@gmail.com";
//        String from = "sammarsaini1009@gmail.com";
//
//        sendEmail(message, subject, to, from);
//    }
//
//    // this method is responsible for sending email
//    private static void sendEmail(String message, String subject, String to, String from) {
//        // variable for email
//        String host = "smtp.gmail.com";
//
//        // get the system properties
//        Properties properties = System.getProperties();
//        System.out.println("PROPERTIES " + properties);
//
//        // setting important information to properties object
//
//        // host set
//        properties.put("mail.smtp.host", host);
//        properties.put("mail.smtp.port", "465");
//        properties.put("mail.smtp.ssl.enable", "true");
//        properties.put("mail.smtp.auth", "true");
//
//       Session session= Session.getInstance(properties, new Authenticator(){
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("sammarsaini1009@gmail.com", "@S@m12345");
//            }
//        });
//        session.setDebug(true);
//
//        // step 2: compose the message [text, multimedia]
//        //MimeMessage m = new MimeMessage(session);
//
//        try {
//            MimeMessage m = new MimeMessage(session);
//            // from email
//            m.setFrom(new InternetAddress(from));
//
//            // adding recipient to message
//            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//            // adding subject to message
//            m.setSubject(subject);
//
//            // adding text to message
//            m.setText(message);
//
//            // send
//
//            // step 3: send the message using the Transport class
//            Transport.send(m);
//            System.out.println("SENT SUCCESSFULLY.......--> :) ");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}