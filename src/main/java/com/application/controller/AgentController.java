package com.application.controller;

import com.application.model.AgentRequest;
import com.application.tools.EmployeeTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/agent")
public class AgentController {

    @Autowired
    private ChatClient chatClient;

    @Autowired
    private EmployeeTools employeeTools;

    @PostMapping(value = "/ask")
    public String askQuestion(@RequestBody AgentRequest agentRequest) {
        return  chatClient
                .prompt()
                .user(agentRequest.getQuestion())
                .tools(employeeTools)
                .call()
                .content();
    }
}
