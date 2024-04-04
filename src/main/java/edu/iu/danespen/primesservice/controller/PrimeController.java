package edu.iu.danespen.primesservice.controller;

import edu.iu.danespen.primesservice.rabbitmq.MQSender;
import edu.iu.danespen.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimeController {
    IPrimesService primesService;
    private final MQSender mqSender;
    public PrimeController(IPrimesService primesService, MQSender mqSender){
        this.primesService = primesService;
        this.mqSender = mqSender;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n){
        boolean result = primesService.isPrime(n);
        mqSender.sendMessage(n, result);
        return result;
    }}
