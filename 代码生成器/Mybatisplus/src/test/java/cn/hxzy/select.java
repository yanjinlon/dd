package cn.hxzy;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest

class select {

//	@Autowired
//	public UserMapp userMapp;
//
//
//	@Test
//	void selectList() {
//		List<User> list = userMapp.selectList(null);
//		list.forEach(System.out::print);
//	}
//	/**
//	 * 根据id查询
//	 */
//	@Test
//	void testSelectById(){
//		User user = userMapp.selectById(1L);
//		System.out.println(user);
//	}
//	/**
//	 * 根据多个id查询
//	 */
//	@Test
//	void testSelectByIds(){
//		List<User> users = userMapp.selectBatchIds(Arrays.asList(1, 2, 3));
//		users.forEach(System.out::println);
//	}
//	/**
//	 * 简单的条件查询
//	 */
////	@Test
////	void testSelectByWarper(){
////		HashMap<String, Object> map = new HashMap<>();
////		map.put("name", "Jone");
////		map.put("age", 18);
////		List<User> users = userMapp.selectByMap(map);
////		users.forEach(System.out::println);
////	}
//
//	@Test
//	void deleteUserById(){
//		QueryWrapper<User> wrapper=new QueryWrapper<User>();
//		wrapper.eq("id","100");
//		int delete = userMapp.delete(wrapper);
//		System.out.println(delete);
//	}
//
//	@Test
//	void insert(){
//		User u1=new User();
//		u1.setName("郭小嘉六号");
//		u1.setEmail("877224@qq.com");
//		u1.setAge(88);
//		int insert = userMapp.insert(u1);
//		System.out.println(insert);
//	}
//
//
////	@Test
////	void updateById(){
////		User u1=new User();
////		u1.setId((long) 1000);
////		u1.setName("张三");
////		u1.setEmail("877224@qq.com");
////		u1.setAge(20);
////		userMapp.updateById(u1);
////	}
//
////	@Test
////	void Test2() {
////
////
////
////		userMapp.selectCount(null);
////
////		userMapp.selectMaps(null);
////		userMapp.selectMapsPage(null,null);
////		userMapp.selectObjs(null);
////		userMapp.selectOne(null);
////		userMapp.selectPage(null,null);
////
////
////		userMapp.equals(null);
////		userMapp.hashCode();
////		userMapp.toString();
////		userMapp.delete(null);
////		userMapp.deleteBatchIds(null);
////		userMapp.deleteById(null);
////		userMapp.deleteByMap(null);
////		userMapp.notify();
////		userMapp.insert(null);
////		userMapp.getClass();
////
////		//		userMapp.wait();
////
////
////
////
////	}



}
