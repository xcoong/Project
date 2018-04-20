package com.atguigu.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class MyCacheUtil {

	public static String interKeys(String... keys) {
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtils.getJedis();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 生产动态key
		jedis.zinterstore("k0", keys);
		return "k0";
	}

	public static <T> List<T> getList(String key, Class<T> t) {
		List<T> list = new ArrayList<T>();
		// 第三方数据调用
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtils.getJedis();
		} catch (Exception e) {
			return null;
		}

		Set<String> zrange = jedis.zrange(key, 0, -1);
		Iterator<String> iterator = zrange.iterator();
		while (iterator.hasNext()) {
			String skuStr = iterator.next();

			T sku = MyJsonUtil.json_to_object(skuStr, t);

			list.add(sku);
		}

		return list;
	}

	public static <T> void setkey(String key, List<T> list) {
		// 第三方数据调用
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtils.getJedis();
		} catch (Exception e) {
			// 记日志

		}
		for (int i = 0; i < list.size(); i++) {
			jedis.zadd(key, i, MyJsonUtil.object_to_json(i));
		}
	}

	public static boolean if_key(String key) {
		// 第三方数据调用
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtils.getJedis();
		} catch (Exception e) {
			// 记日志

		}
		Boolean exists=jedis.exists(key);

		return exists;

	}
}
