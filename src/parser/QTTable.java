package parser;

import java.util.ArrayList;
import parser.QTInfo;

public class QTTable {
	   
		public static ArrayList<QTInfo> mytable=null;

		public QTTable(ArrayList<QTInfo> mytable) {
			super();
			QTTable.mytable = mytable;
		}

		public static boolean replaceFirst(String name1,String name2){
			boolean index=false;
			for(QTInfo temp:mytable){
				if(temp.getResult().equals(name1)){
					temp.setResult(name2);
					index=true;
					break;
				}
			}
			return index;
		}

		public static boolean replaceAll(String name1,String name2){
			boolean index=false;

			for(QTInfo temp:mytable){
				if(temp.getResult().equals(name1)){
					temp.setResult(name2);
					index=true;
				}
			}
			return index;
		}

		public QTInfo getSys(String name){
			QTInfo temper=null;

			for(QTInfo temp:mytable){
				if(temp.getResult().equals(name)){
					temper=temp;
				}
			}
			return temper;
		}


		public static void addQTInfo(QTInfo temp){
			mytable.add(temp);
		}
		 public void clear()
		    {
		    	mytable.clear();
		    }
	}
