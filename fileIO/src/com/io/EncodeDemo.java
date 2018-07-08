package com.io;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s = "慕课ABC";
		System.out.println("【1、项目默认编码为utf-8】");
		byte[] byte1 = s.getBytes();// 转化成[字节序列]，项目默认编码为utf-8。
		for (byte b : byte1) {
			// 把字节转化为int,然后以16进制的方式展示
			// b & 0x000000FF的作用是，如果byteVar 是负数，则会清除前面24个零，正的byte整型不受影响。
			// 一个byte只有八位，肯定前面24个是零了。
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// e6 85 95 e8 af be 41 42 43 一个汉字占三个字节了。
		}
		System.out.println("");
		System.out.println("【2、使用gbk编码】");
		byte[] byte2 = s.getBytes("gbk");
		for (byte b : byte2) {
			// 把字节转化为int,然后以16进制的方式展示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 一个汉字占两个字节了。
		}
		System.out.println("");
		System.out.println("【3、使用gb2312编码】");
		byte[] byte3 = s.getBytes("gb2312");
		for (byte b : byte3) {
			// 把字节转化为int,然后以16进制的方式展示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 一个汉字占两个字节了。
		}
		System.out.println("");
		System.out.println("【4、使用ascii编码】");
		byte[] byte4 = s.getBytes("ascii");
		for (byte b : byte4) {
			// 把字节转化为int,然后以16进制的方式展示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 一个汉字占两个字节了。
		}
		System.out.println("");
		System.out.println("【5、java是双字节编码 utf-16be】");
		byte[] byte5 = s.getBytes("utf-16be");
		for (byte b : byte5) {
			// 把字节转化为int,然后以16进制的方式展示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 一个汉字占两个字节了。
		}
		System.out.println();
		for (byte b : byte5) {
			System.out.print(b + " ");
			// c4 bd bf ce 41 42 43 一个汉字占两个字节了。
		}
		/*
		 * 文本文件，就是字节序列 可以是任意编码的字节序列 如果我们在中文机器上直接创建文本文件，那么该文本文件只认识ansi编码
		 * 
		 */
	}

}
