package com.io;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonArrayTest {

	// JsonArray���ԡ�[]����������������(Array����)����JsonObject�ǡ�{}�����������Ķ���Object���󣩣�
	// ����JSONObject����
	private static JSONObject createJSONObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("username", "huangwuyi");
		jsonObject.put("sex", "��");
		jsonObject.put("QQ", "413425430");
		jsonObject.put("Min.score", new Integer(99));
		jsonObject.put("nickname", "�����ľ�");
		return jsonObject;
	}

	public static void main(String[] args) {
		JSONObject jsonObject = createJSONObject();// ����������ֱ��ͨ������+��������
		// ���jsonobject����
		System.out.println("jsonObject��" + jsonObject);

		// �ж�������������
		boolean isArray = jsonObject.isArray();
		boolean isEmpty = jsonObject.isEmpty();
		boolean isNullObject = jsonObject.isNullObject();
		System.out.println("�Ƿ�Ϊ����:" + isArray + "�� �Ƿ�Ϊ��:" + isEmpty + "�� isNullObject:" + isNullObject);

		// �������ԣ���jsonObject����׷��Ԫ�ء�
		jsonObject.element("address", "����ʡ������");
		System.out.println("�������Ժ�Ķ���" + jsonObject);

		// ����һ��JSONArray����
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(0, "this is a jsonArray value");
		jsonArray.add(1, "another jsonArray value");
		jsonObject.element("jsonArray", jsonArray);
		// ��jsonObject����ס��һ��jsonArray
		JSONArray array = jsonObject.getJSONArray("jsonArray");
		System.out.println(jsonObject);

		System.out.println("����һ��JSONArray����" + array);
		// ����JSONArray���ֵ
		// {"username":"huangwuyi","sex":"��","QQ":"413425430","Min.score":99,"nickname":"�����ľ�","address":"����ʡ������","jsonArray":["this
		// is a jsonArray value","another jsonArray value"]}
		System.out.println("���=" + jsonObject);

		// ����key����һ���ַ���
		String username = jsonObject.getString("username");
		System.out.println("username==>" + username);

		// ���ַ�ת��Ϊ JSONObject
		String temp = jsonObject.toString();
		JSONObject object = JSONObject.fromObject(temp);
		// ת�������Key����ֵ
		System.out.println("qq=" + object.get("QQ"));

	}
}