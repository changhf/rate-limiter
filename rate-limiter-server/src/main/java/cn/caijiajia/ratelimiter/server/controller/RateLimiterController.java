package cn.caijiajia.ratelimiter.server.controller;

import cn.caijiajia.ratelimiter.server.form.RateLimiterForm;
import cn.caijiajia.ratelimiter.server.service.RateLimiterService;
import cn.caijiajia.ratelimiter.server.vo.RateLimiterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author wukaiqiang
 */
@RestController
public class RateLimiterController {
    @Autowired
    private RateLimiterService rateLimiterService;

    @RequestMapping(value = "/rate-limiters")
    public List<RateLimiterVo> getRateLimiters(@RequestParam String context) {
        return rateLimiterService.getRateLimiters(context);
    }

    @RequestMapping(value = "/rate-limiters", method = RequestMethod.POST)
    public void saveOrUpdateRateLimiter(@RequestBody RateLimiterForm form) {
        rateLimiterService.saveOrUpdateRateLimiter(form);
    }


    @RequestMapping(value = "/rate-limiters/{context}/{name}", method = RequestMethod.DELETE)
    public void deleteRateLimiter(@PathVariable String context, @PathVariable String name) {
        rateLimiterService.deleteRateLimiter(context, name);
    }


}