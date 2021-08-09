package arrayPracticePrograms;

public class Solution1 
{
	public static void main(String[]args)
	{
		Document1[] d1=new Document1[4];
		d1[0]=new Document1(11,"books","java",20);
		d1[1]=new Document1(12,"article","is",20);
		d1[2]=new Document1(13,"pdfs","high",20);
		d1[3]=new Document1(14,"files","level",20);
		Document1 doc=CombineDoc(d1);
		System.out.println(doc);
		
	}
	public static Document1 CombineDoc(Document1[] d1)
	{
		
		 int tid=0;
		 String tfname="";
		 String ttitle="";
		 int tpages=0;
		 int sum=0;
		 for(int i=0;i<=d1.length-1;i++)
		 {
			 int id=d1[i].getId();
			 if(tid>id)
			 {
				 tid=id;
			 }
			 tid=d1[i].getId();
			 ttitle=ttitle+d1[i].getTitle();
			 tfname=tfname+"#"+d1[i].getFname();
			 sum=sum+d1[i].getPages();
			 tpages=sum;
		 }
		 Document1 d=new Document1(tid,tfname,ttitle,tpages);
		 return d;		 	 
	}
}
