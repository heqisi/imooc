package com.io;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s = "Ľ��ABC";
		System.out.println("��1����ĿĬ�ϱ���Ϊutf-8��");
		byte[] byte1 = s.getBytes();// ת����[�ֽ�����]����ĿĬ�ϱ���Ϊutf-8��
		for (byte b : byte1) {
			// ���ֽ�ת��Ϊint,Ȼ����16���Ƶķ�ʽչʾ
			// b & 0x000000FF�������ǣ����byteVar �Ǹ�����������ǰ��24���㣬����byte���Ͳ���Ӱ�졣
			// һ��byteֻ�а�λ���϶�ǰ��24�������ˡ�
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// e6 85 95 e8 af be 41 42 43 һ������ռ�����ֽ��ˡ�
		}
		System.out.println("");
		System.out.println("��2��ʹ��gbk���롿");
		byte[] byte2 = s.getBytes("gbk");
		for (byte b : byte2) {
			// ���ֽ�ת��Ϊint,Ȼ����16���Ƶķ�ʽչʾ
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 һ������ռ�����ֽ��ˡ�
		}
		System.out.println("");
		System.out.println("��3��ʹ��gb2312���롿");
		byte[] byte3 = s.getBytes("gb2312");
		for (byte b : byte3) {
			// ���ֽ�ת��Ϊint,Ȼ����16���Ƶķ�ʽչʾ
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 һ������ռ�����ֽ��ˡ�
		}
		System.out.println("");
		System.out.println("��4��ʹ��ascii���롿");
		byte[] byte4 = s.getBytes("ascii");
		for (byte b : byte4) {
			// ���ֽ�ת��Ϊint,Ȼ����16���Ƶķ�ʽչʾ
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 һ������ռ�����ֽ��ˡ�
		}
		System.out.println("");
		System.out.println("��5��java��˫�ֽڱ��� utf-16be��");
		byte[] byte5 = s.getBytes("utf-16be");
		for (byte b : byte5) {
			// ���ֽ�ת��Ϊint,Ȼ����16���Ƶķ�ʽչʾ
			System.out.print(Integer.toHexString(b & 0xff) + " ");
			// c4 bd bf ce 41 42 43 һ������ռ�����ֽ��ˡ�
		}
		System.out.println();
		for (byte b : byte5) {
			System.out.print(b + " ");
			// c4 bd bf ce 41 42 43 һ������ռ�����ֽ��ˡ�
		}
		/*
		 * �ı��ļ��������ֽ����� ���������������ֽ����� ������������Ļ�����ֱ�Ӵ����ı��ļ�����ô���ı��ļ�ֻ��ʶansi����
		 * 
		 */
	}

}
