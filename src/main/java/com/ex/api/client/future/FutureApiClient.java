package com.ex.api.client.future;

import com.ex.api.dto.CommonResponse;
import com.ex.api.dto.future.FuturePostOrderRequest;
import com.ex.api.dto.future.MergePositionDTO;


import java.util.List;
import java.util.Map;


public interface FutureApiClient {


    CommonResponse postOrder(FuturePostOrderRequest request);

    CommonResponse batchOrder(List<FuturePostOrderRequest> futurePostOrderRequestList);


    CommonResponse orderListHistory(Map<String, String> params);

    CommonResponse orderTradeList(Map<String, String> params);

    CommonResponse orderDetail(Long orderId);

    CommonResponse orderList(Map<String, String> params);

    CommonResponse orderCancel(Long orderId);

    CommonResponse cancelOrderBatch(List<Long> orderIdList, List<String> clientOrderIds);

    CommonResponse allCancel(String symbol);

    CommonResponse entrustCreatePlan(Map<String, String> params);

    CommonResponse entrustCancelPlan(Long entrustId);

    CommonResponse entrustCancelAllPlan(String symbol);



    CommonResponse accountInfo();

    CommonResponse balanceDetail(String coin);

    CommonResponse createMockOrder(FuturePostOrderRequest request);

    CommonResponse mergePosition(Map<String, String> params);
}
