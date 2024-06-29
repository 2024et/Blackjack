package blackjack;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int bed, Scores, judge, i=0;
		int n1, n2, n3, n4, n5, n6, n7, n8 ,n9, m10, n11;
		System.out.println("プレイスユアベッド");
		bed = in.nextInt();
		System.out.println("ノーモアベッド");
		n1 = rand.nextInt(10)+1;
		n2 = rand.nextInt(10)+1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		Scores = n1 + n2;
		if(Scores>21) {
			System.out.println("バスト");
			while (i <= 15) {
	            int randomNum = rand.nextInt(10)+1; 
	            i += randomNum;
	        }
			System.out.println("ディーらは"+i+"でした。よって...");
			if(i>21) {
				System.out.println("両者負け");
			}else {
				System.out.println("あたなの勝ちです。");
			}
		}else {
			System.out.println("ヒットする場合は0を、スタンドする場合は1を入力してください。");
			judge = in.nextInt();
			if(judge==0) {
				n3 = rand.nextInt(10) + 1;
				System.out.println(n3);	
				Scores += n3;
				
				if(Scores>21) {
					System.out.println("バスト");
					while (i <= 15) {
			            int randomNum = rand.nextInt(10)+1; 
			            i += randomNum;
			        }
					System.out.println("ディーらは"+i+"でした。よって...");
					if(i>21) {
						System.out.println("あなたの勝ちです。");
					}else {
						System.out.println("あたなの負けです。");
					}
				}else {
					System.out.println("ヒットする場合は0を、スタンドする場合は1を入力してください。");
					judge = in.nextInt();
					if(judge==0) {
						n4 = rand.nextInt(10) + 1;
						System.out.println(n4);	
						Scores += n4;
						if(Scores>21) {
							System.out.println("バスト");
							while (i <= 15) {
					            int randomNum = rand.nextInt(10)+1; 
					            i += randomNum;
					        }
							System.out.println("ディーらは"+i+"でした。よって...");
							if(i>21) {
								System.out.println("あなたの勝ちです。");
							}else {
								System.out.println("あたなの負けです。");
							}
						}else {
							System.out.println("ヒットする場合は0を、スタンドする場合は1を入力してください。(ヒットする場合これが最後となります。)");
							judge = in.nextInt();
							if(Scores==0) {
								n5 = rand.nextInt(10) + 1;
								System.out.println(n5);	
								Scores += n5;
								if(Scores>21) {
									System.out.println("バスト");
									while (i <= 15) {
							            int randomNum = rand.nextInt(10)+1; 
							            i += randomNum;
							        }
									System.out.println("ディーらは"+i+"でした。よって...");
									if(i>21) {
										System.out.println("あなたの勝ちです。");
									}else {
										System.out.println("あたなの負けです。");
									}
								}else {
									while (i <= 15) {
							            int randomNum = rand.nextInt(10)+1; 
							            i += randomNum;
							        }
									System.out.println("ディーらは"+i+"でした。よって...");
									if(i>21) {
										System.out.println("あなたの勝ちです。");
									}else {
										if(i<Scores) {
											System.out.println("あなたの勝ちです。");
										}else {
											if(i==Scores) {
												System.out.println("引き分けです。");
											}else {
												System.out.println("あなたの負けです。");
											}
										}
									}
								}
							}else {
								while (i <= 15) {
						            int randomNum = rand.nextInt(10)+1; 
						            i += randomNum;
						        }
								System.out.println("ディーらは"+i+"でした。よって...");
								if(i>21) {
									System.out.println("あなたの勝ちです。");
								}else {
									if(i<Scores) {
										System.out.println("あなたの勝ちです。");
									}else {
										if(i==Scores) {
											System.out.println("引き分けです。");
										}else {
											System.out.println("あなたの負けです。");
										}
									}
								}
							}
							
						}
					}else {
						while (i <= 15) {
				            int randomNum = rand.nextInt(10)+1; 
				            i += randomNum;
				        }
						System.out.println("ディーらは"+i+"でした。よって...");
						if(i>21) {
							System.out.println("あなたの勝ちです。");
						}else {
							if(i<Scores) {
								System.out.println("あなたの勝ちです。");
							}else {
								if(i==Scores) {
									System.out.println("引き分けです。");
								}else {
									System.out.println("あなたの負けです。");
								}
							}
						}
					}
				}
				
			}else {
				while (i <= 15) {
		            int randomNum = rand.nextInt(10)+1; 
		            i += randomNum;
		        }
				System.out.println("ディーらは"+i+"でした。よって...");
				if(i>21) {
					System.out.println("あなたの勝ちです。");
				}else {
					if(i<Scores) {
						System.out.println("あなたの勝ちです。");
					}else {
						if(i==Scores) {
							System.out.println("引き分けです。");
						}else {
							System.out.println("あなたの負けです。");
						}
						
					}
				}
			}
		}

	}

}
