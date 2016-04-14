package main.business;

/*
 *  @author Team A
 */

public class BassDisplay {
	String noteOne="";
	String noteTwo="";
	String noteThree="";
	StringBuilder musicString=new StringBuilder();

	public void BassNoteDisplay(String noteOne,String noteTwo,String noteThree){
		this.noteOne=noteOne;
		this.noteTwo=noteTwo;
		this.noteThree=noteThree;
		String dash="-----";
		String blank="     ";
		String whole="--O--";
		String noBars="  O  ";

		String[][] clefNew= new String[9][9];

		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew.length;j++){
				if (i%2 ==0){
					clefNew[i][j]=dash;
				}else{
					clefNew[i][j]=blank;			
				}
			}
		}

		switch(noteOne){
		case "b":
			clefNew[0][0]=whole;
			break;
		case "a":
			clefNew[1][0]=noBars;
			break;
		case "g":
			clefNew[2][0]=whole;
			break;
		case "f":
			clefNew[3][0]=noBars;
			break;
		case "e":
			clefNew[4][0]=whole;
			break;
		case "d":
			clefNew[5][0]=noBars;
			break;
		case "c":
			clefNew[6][0]=whole;
			break;
		case "":
			break;
		default:
			break;
		}

		switch(noteTwo){
		case "b":
			clefNew[0][1]=whole;
			break;
		case "a":
			clefNew[1][1]=noBars;
			break;
		case "g":
			clefNew[2][1]=whole;
			break;
		case "f":
			clefNew[3][1]=noBars;
			break;
		case "e":
			clefNew[4][1]=whole;
			break;
		case "d":
			clefNew[5][1]=noBars;
			break;
		case "c":
			clefNew[6][1]=whole;
			break;
		case "":
			break;
		default:
			break;
		}

		switch(noteThree){
		case "b":
			clefNew[0][2]=whole;
			break;
		case "a":
			clefNew[1][2]=noBars;
			break;
		case "g":
			clefNew[2][2]=whole;
			break;
		case "f":
			clefNew[3][2]=noBars;
			break;
		case "e":
			clefNew[4][2]=whole;
			break;
		case "d":
			clefNew[5][2]=noBars;
			break;
		case "c":
			clefNew[6][2]=whole;
			break;
		case "":
			break;
		default:
			break;
		}
		System.out.println("Bass");
		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew.length;j++){
				musicString.append(clefNew[i][j]);
			}musicString.append("\n");
		}
	}
	public void BassNoteDisplay(String noteOne,String noteTwo){
		this.noteOne=noteOne;
		this.noteTwo=noteTwo;
		String dash="-----";
		String blank="     ";
		String whole="--O--";
		String noBars="  O  ";

		String[][] clefNew= new String[9][9];

		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew.length;j++){
				if (i%2 ==0){
					clefNew[i][j]=dash;
				}else{
					clefNew[i][j]=blank;			
				}
			}
		}

		switch(noteOne){
		case "b":
			clefNew[0][0]=whole;
			break;
		case "a":
			clefNew[1][0]=noBars;
			break;
		case "g":
			clefNew[2][0]=whole;
			break;
		case "f":
			clefNew[3][0]=noBars;
			break;
		case "e":
			clefNew[4][0]=whole;
			break;
		case "d":
			clefNew[5][0]=noBars;
			break;
		case "c":
			clefNew[6][0]=whole;
			break;
		case "":
			break;
		default:
			break;
		}

		switch(noteTwo){
		case "b":
			clefNew[0][1]=whole;
			break;
		case "a":
			clefNew[1][1]=noBars;
			break;
		case "g":
			clefNew[2][1]=whole;
			break;
		case "f":
			clefNew[3][1]=noBars;
			break;
		case "e":
			clefNew[4][1]=whole;
			break;
		case "d":
			clefNew[5][1]=noBars;
			break;
		case "c":
			clefNew[6][1]=whole;
			break;
		case "":
			break;
		default:
			break;
		}
		System.out.println("Bass");
		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew.length;j++){
				musicString.append(clefNew[i][j]);
			}musicString.append("\n");
		}
	}
	public void BassNoteDisplay(String noteOne){
		this.noteOne=noteOne;
		String dash="-----";
		String blank="     ";
		String whole="--O--";
		String noBars="  O  ";

		String[][] clefNew= new String[9][9];

		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew.length;j++){
				if (i%2 ==0){
					clefNew[i][j]=dash;
				}else{
					clefNew[i][j]=blank;			
				}
			}
		}
		
		switch(noteOne){
		case "b":
			clefNew[0][0]=whole;
			break;
		case "a":
			clefNew[1][0]=noBars;
			break;
		case "g":
			clefNew[2][0]=whole;
			break;
		case "f":
			clefNew[3][0]=noBars;
			break;
		case "e":
			clefNew[4][0]=whole;
			break;
		case "d":
			clefNew[5][0]=noBars;
			break;
		case "c":
			clefNew[6][0]=whole;
			break;
		case "":
			break;
		default:
			break;
		}
		System.out.println("Bass");
		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew.length;j++){
				musicString.append(clefNew[i][j]);
			}musicString.append("\n");
		}
	}
}
