import javax.swing.JFrame;
public class GameFrame extends JFrame{
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //sizes the frame so that all contents are at preferred sizes.
        this.setVisible(true);
        this.setLocationRelativeTo(null); //appear in middle of computer
    }

}
