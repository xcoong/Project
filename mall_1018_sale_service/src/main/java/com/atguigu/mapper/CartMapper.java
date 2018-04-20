package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.T_MALL_SHOPPINGCAR;

public interface CartMapper {

	List<T_MALL_SHOPPINGCAR> select_list_cart_by_user(int user_id);
	
	public int select_cart_exists(T_MALL_SHOPPINGCAR cart);

	public void update_cart(T_MALL_SHOPPINGCAR cart);

	public void insert_cart(T_MALL_SHOPPINGCAR cart);


}
