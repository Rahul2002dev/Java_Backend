package org.example.mail.Service;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendToEmail(String toEmail, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rp95018089@gmail.com");
        message.setTo("tubebute1173@gmail.com");
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
        System.out.println("Email sent");
    }

}
