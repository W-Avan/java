package com.imooc.cards;

public class demo {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Operate ot = new Operate();
		ot.createCards();  //����һ���˿���
		ot.shuffleCards(); //ϴ�Ʋ���
		ot.CreatePlayer(); //�����������
		ot.dealCards();    //���Ʋ���
		ot.startGame();    //��ʼ��Ϸ
	}

}
