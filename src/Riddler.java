import javax.swing.JOptionPane;

public class Riddler {

public static void main(String[] args) {	

String rid = JOptionPane.showInputDialog("I turn polar bears white and I will make you cry. I make guys have to pee and girls comb their hair. I make celebrities look stupid and normal people look like celebrities. I turn pancakes brown and make your champane bubble. If you squeeze me, I'll pop. If you look at me, you'll pop. Can you guess the riddle?");
	
if(rid.equalsIgnoreCase("No")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	JOptionPane.showMessageDialog(null, "97% of Harvard Graduates couldn't figure out the riddle!");
}
else {
	JOptionPane.showMessageDialog(null, "Nope");
	JOptionPane.showMessageDialog(null, "The question is 'Can you guess the riddle.' It's obviously no. Don't worry, 97% of Harvard graduates couldn't figure this riddle out.");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}