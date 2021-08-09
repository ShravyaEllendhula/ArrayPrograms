package arrayPracticePrograms;

public class Solution2 
{
	public static void main(String[]args)
	{
		Document1[] d1=new Document1[4];
		d1[0]=new Document1(24,"UI","java",210);
		d1[1]=new Document1(89,"Study","sql",378);
		d1[2]=new Document1(93,"Subject","web",319);
		d1[3]=new Document1(14,"Desktop","j2ee",289);
		Document1 doc=CombineDoc(d1);
		System.out.println(doc);
		
	}
	public static Document1 CombineDoc(Document1[] d1)
	{
		int finalId=d1[0].getId();
		String finalFname=d1[0].getFname();
		String finalTitle=d1[0].getTitle();
		int finalPages=d1[0].getPages();
		for(int i=1;i<=d1.length-1;i++)
		{
			int tempId=d1[i].getId();
			if(tempId>finalId)
			{
				finalId=tempId;
			}
			String tempFname=d1[i].getFname();
			finalFname=finalFname+"#"+tempFname;
			String tempTitle=d1[i].getTitle();
			finalTitle=finalTitle+tempTitle;
			int tempPages=d1[i].getPages();
			finalPages=finalPages+tempPages;
		}
		Document1 rv=new Document1(finalId,finalFname,finalTitle,finalPages);
		return rv;
	}
	
}
