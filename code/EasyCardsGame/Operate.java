package com.imooc.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Operate {
	static List<Cards> cardsList = new ArrayList<Cards>();  //�������һ���˿���
	static Scanner console = new Scanner(System.in);
	static List<Player> playerList = new ArrayList<Player>(); //������������Ϣ
	
	public void createCards() {
		//����˳�򴴽�һ���˿���
		Cards[] cards = {
				new Cards("��Ƭ", 2), new Cards("��Ƭ", 3), new Cards("��Ƭ", 4), new Cards("��Ƭ", 5), new Cards("��Ƭ", 6), new Cards("��Ƭ", 7), new Cards("��Ƭ", 8), new Cards("��Ƭ", 9), new Cards("��Ƭ", 10), new Cards("��Ƭ", 11), new Cards("��Ƭ", 12), new Cards("��Ƭ", 13), new Cards("��Ƭ", 14),
				new Cards("÷��", 2), new Cards("÷��", 3), new Cards("÷��", 4), new Cards("÷��", 5), new Cards("÷��", 6), new Cards("÷��", 7), new Cards("÷��", 8), new Cards("÷��", 9), new Cards("÷��", 10), new Cards("÷��", 11), new Cards("÷��", 12), new Cards("÷��", 13), new Cards("÷��", 14),
				new Cards("����", 2), new Cards("����", 3), new Cards("����", 4), new Cards("����", 5), new Cards("����", 6), new Cards("����", 7), new Cards("����", 8), new Cards("����", 9), new Cards("����", 10), new Cards("����", 11), new Cards("����", 12), new Cards("����", 13), new Cards("����", 14),
				new Cards("����", 2), new Cards("����", 3), new Cards("����", 4), new Cards("����", 5), new Cards("����", 6), new Cards("����", 7), new Cards("����", 8), new Cards("����", 9), new Cards("����", 10), new Cards("����", 11), new Cards("����", 12), new Cards("����", 13), new Cards("����", 14)
		};
		cardsList.addAll(Arrays.asList(cards));
		System.out.println("---------------�����˿��Ƴɹ�--------------");
		for (Cards cards2 : cards) {
			if(cards2.getNumber() <= 10)
			{
				System.out.print(cards2.getType()+cards2.getNumber()+" ");
			}
			else {
				System.out.print(cards2.getType());
				if(cards2.getNumber() == 11)
					System.out.print("J ");
				if(cards2.getNumber() == 12)
					System.out.print("Q ");
				if(cards2.getNumber() == 13)
					System.out.print("K ");
				if(cards2.getNumber() == 14)
					System.out.print("A ");
			}
		}
		System.out.println();
//		System.out.println(cardsList.size());
	}
	
	public void shuffleCards() {
		//ϴ�Ʋ���
		System.out.println("---------------��ʼϴ��-----------------");
		Collections.shuffle(cardsList);  //����collections�������������
		System.out.println("---------------ϴ�ƽ���-----------------");
	}
	
	public void CreatePlayer() {
		//�����������
		System.out.println("---------------�������-----------------");
		for(int i = 0; i <2; i++) {
			System.out.println("�������" + (i+1) + "λ��ҵ�ID������");
			while(true) {
				try {
						System.out.println("������ID:");
						int id = console.nextInt();
						System.out.println("������������");
						String name = console.next();
						Player player = new Player(id, name);
						playerList.add(player);
						break;
				}catch(InputMismatchException e) {
					String token = console.next();
					System.out.println("�������������͵�ID��");
					continue;
				}
			}
		}
		for (Player player : playerList) {
			System.out.println("------��ӭ��ң�" + player.getName());
		}
	}
	
	public void dealCards() {
		//���Ʋ���
		System.out.println("---------------��ʼ����-----------------");
		for(int i = 0; i < 4;) {
			for (Player player : playerList) {
				player.hand.add((Cards)cardsList.get(i));
				System.out.println("------��ң�" + player.getName() + "-����"); 
				i++;
			}
		}
			
		System.out.println("---------------���ƽ���-----------------");
	}
	
	public void startGame() {
		System.out.println("---------------��ʼ��Ϸ------------------");
		List<Cards> maxCards = new ArrayList<Cards>();
//		List<Cards> winCards = new ArrayList<Cards>();
		for(Player player : playerList) {
			Collections.sort(player.hand);
			for(int i = 0; i <player.hand.size(); i++) {
				if(player.hand.get(i).getNumber() <= 10)
					System.out.println(player.hand.get(i).getType()+player.hand.get(i).getNumber());
				else {
					System.out.print(player.hand.get(i).getType());
					if(player.hand.get(i).getNumber() == 11)
						System.out.println('J');
					if(player.hand.get(i).getNumber() == 12)
						System.out.println('Q');
					if(player.hand.get(i).getNumber() == 13)
						System.out.println('K');
					if(player.hand.get(i).getNumber() == 14)
						System.out.println('A');
				}
			}
			if(player.hand.get(player.hand.size()-1).getNumber() == (player.hand.get(player.hand.size()-2).getNumber())){
				Cards[] cards0 = {
						(Cards)player.hand.get(player.hand.size()-1), (Cards)player.hand.get(player.hand.size()-2)
				};
				List<Cards> Max= new ArrayList<Cards>();
				Max.addAll(Arrays.asList(cards0));
				Collections.sort(Max, new CardsComparator());
				Cards card1 = (Cards)Max.get(0);
				Cards card2 = (Cards)Max.get(1);
				Cards[] cards3 = {
						card1,card2
				};
				player.hand.remove(player.hand.size()-1);
				player.hand.remove(player.hand.size()-1);
				player.hand.addAll(Arrays.asList(cards3));
			}
			System.out.print("��ң�" + player.getName() + "��������Ϊ��" + player.hand.get(player.hand.size()-1).getType());
			if(player.hand.get(player.hand.size()-1).getNumber() <= 10)
				System.out.println(player.hand.get(player.hand.size()-1).getNumber());
			if(player.hand.get(player.hand.size()-1).getNumber() == 11)
				System.out.println('J');
			if(player.hand.get(player.hand.size()-1).getNumber() == 12)
				System.out.println('Q');
			if(player.hand.get(player.hand.size()-1).getNumber() == 13)
				System.out.println('K');
			if(player.hand.get(player.hand.size()-1).getNumber() == 14)
				System.out.println('A');
			maxCards.add(player.hand.get(player.hand.size()-1));
		}
		
		Collections.sort(maxCards);
		if(maxCards.get(1).getNumber() == (maxCards.get(0).getNumber())) {
			Collections.sort(maxCards, new CardsComparator());
		}
		String winner;
		for (Player player : playerList) {
			if(player.hand.get(player.hand.size()-1).getType().equals(maxCards.get(1).getType()) && (player.hand.get(player.hand.size()-1).getNumber() == maxCards.get(1).getNumber())) {
				winner = player.getName();
				System.out.println("----------------��ң�" + winner + "��ʤ��---------------------");
				break;
			}
		}
		System.out.println("��Ҹ��Ե�����Ϊ��");
		for (Player player : playerList) {
			System.out.print(player.getName() + ":[ " );
			for(int i = 0; i < player.hand.size(); i++) {
				if(player.hand.get(i).getNumber() <= 10)
					System.out.print(player.hand.get(i).getType() + player.hand.get(i).getNumber() + " ");
				else {
					System.out.print(player.hand.get(i).getType());
					if(player.hand.get(i).getNumber() == 11)
						System.out.print("J ");
					if(player.hand.get(i).getNumber() == 12)
						System.out.print("Q ");
					if(player.hand.get(i).getNumber() == 13)
						System.out.print("K ");
					if(player.hand.get(i).getNumber() == 14)
						System.out.print("A ");
				}
				
			}
			System.out.println("]");
		}
		
	}
}
