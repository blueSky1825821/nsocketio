package com.beacon.nsocketio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION:
 * <P>
 * </p>
 *
 * @author wangmin
 * @since 2022/6/21 21:03
 */
@RestController
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }
}
