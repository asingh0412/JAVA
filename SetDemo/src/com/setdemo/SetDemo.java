package com.setdemo;

// Printing the pair of the socks. 
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {1,2,1,2,1,3,2};
		setDemo(ar);
		

	}

	private static void setDemo(int [] ar) {
		// to print the array to make sure. 
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		// TODO Auto-generated method stub
		Set<Integer> sock = new HashSet<>();
		int pairCount = 0;
		
		for(int i = 0; i<ar.length;i++) {
			if(!sock.contains(ar[i])) {
				sock.add(ar[i]);
			}
			else {
				pairCount++;
				sock.remove(ar[i]);
			}
		}
		
		System.out.println("paircount " + pairCount);
		
		sock.clear();
		for(int i=0; i<ar.length;i++) {
			sock.add(ar[i]);
			
		}
		System.out.println("sock" + sock);
		sock.remove(ar[0]);
		System.out.println("sock after remove" + sock);
		
	}

}
