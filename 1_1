class week2_1_1 {
  public static void main(String[] args) {
    int[] start = {4, 23, 45};
	int[] end = {13, 54, 23};
    int [] pass={0, 0, 0};
	int sum =0;
    for (int i=0 ; i < start.length ;i++) {
      pass[i]=end[i]-start[i];
	  for(int x=i;x<start.length-1;x++)
	  {
	  pass[i]=pass[i]*60;
	  }
	  sum=sum+pass[i];
    }
	
	System.out.println("4點23分45秒到13點54分23秒之間的總秒數為："+sum);
  }
}
