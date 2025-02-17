package com.ex.demo;

import com.ex.api.client.spot.SpotApiClientImpl;
import com.ex.api.dto.CommonResponse;
import com.ex.api.dto.spot.SpotPostOrderRequest;
import org.junit.Test;

public class SpotApiClientTest {

    SpotApiClientImpl spotApiClient = new SpotApiClientImpl(null);

    @Test
    public void testpostOrder() {
        SpotPostOrderRequest request = SpotPostOrderRequest.builder().symbol("btc_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("3")
                .quantity("2")
                .build();
        CommonResponse commonResponse = spotApiClient.postOrder(request);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void getOrder() {
        CommonResponse commonResponse = spotApiClient.getOrder(363779203153731136L);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void queryOrder() {
        CommonResponse commonResponse = spotApiClient.queryOrder(363779203153731136L);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void delOrder() {
        CommonResponse commonResponse = spotApiClient.delOrder(363779203153731136L);
        System.out.println("result:"+commonResponse);
    }
}
