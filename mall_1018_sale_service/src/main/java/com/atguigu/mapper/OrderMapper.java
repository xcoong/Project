package com.atguigu.mapper;

import java.util.Map;

import com.atguigu.bean.OBJECT_T_MALL_FLOW;
import com.atguigu.bean.OBJECT_T_MALL_ORDER;
import com.atguigu.bean.T_MALL_ORDER_INFO;

public interface OrderMapper {

	public void insert_order(Map<Object, Object> map_order);

	public void insert_flow(Map<Object, Object> map_flow);

	public void insert_infos(Map<Object, Object> map_info);

	public void delete_carts(Map<Object, Object> map_cart);

	public void update_order(OBJECT_T_MALL_ORDER order);

	public void update_flow(OBJECT_T_MALL_FLOW flow);

	long select_count_kc(int sku_id);

	long select_kc(Map<Object,Object>map);
	
	void update_kc(T_MALL_ORDER_INFO info);
}
