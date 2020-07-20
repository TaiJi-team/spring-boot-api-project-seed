package com.conpany.project;

import java.io.IOException;

import com.company.project.Application;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 单元测试继承该类即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)

@Transactional
@Rollback
public abstract class Tester {

    public static void main(String[] args) {
        AsyncHttpClient client = new DefaultAsyncHttpClient();
        client.preparePost("http://localhost:8080/ex/result/add/result")
        // .setHeader("user-agent", "vscode-restclient")
                .setHeader("content-type", "application/xml")
                .setBody(
                        "<exResult><task_id>3</task_id><resource_id>002</resource_id><ex_total>12</ex_total><suc_cnt>11</suc_cnt><ex_state>0</ex_state></exResult>")
                .execute().toCompletableFuture().thenAccept(System.out::println).join();

        try {
            client.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}



