package com.ck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.internet.MimeMessage;

@Controller
public class EmailController {

    // 注入发件人
    @Value("${mail_from}")
    private String from;

    @Autowired
    private JavaMailSenderImpl sender;

    @RequestMapping("sendEmail")
    @ResponseBody
    public void sendEmail(){
        MimeMessage message = sender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

            helper.setFrom(from);
            helper.setTo("2746893942@qq.com"); //收件人
            helper.setSubject("你好啊");
            helper.setText("hello",true);

            /*String filename = "D:\\Y2出口考试成绩.xlsx"; // 文件路径和文件

            // 解决附件名称的中文乱码
            String newfilename = MimeUtility.encodeWord(filename);

            // 添加附加，第一种方式
            helper.addAttachment(newfilename,new File(filename));

            // 添加附加，第二种方式
            helper.addAttachment(newfilename,
                    new ByteArrayResource(IOUtils.toByteArray(new FileInputStream(new File(filename)))));
*/
            // 发送
            //sender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
