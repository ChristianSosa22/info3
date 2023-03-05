/*
    Esta es su clase principal. El unico metodo que debe implementar es
    public String[] solve(Maze maze)
    pero es libre de crear otros metodos y clases en este u otro archivo que desee.
*/
public class Solver{

    public Solver(){
        //Sientase libre de implementar el contructor de la forma que usted lo desee
    }

    public String solve(Maze maze){
        //Implemente su metodo aqui. Sientase libre de implementar métodos adicionales
        return "[-1]";
    }
    


public String Mover(Maze m){
           
        int x = 0; 
        int y = 0;
        int z = 0;
        Node[][][] nod = this.nodes[x][y][z];
        
        String str;
        
        if (!(isExitSpace(nod.this.xIndex , nod.this.yIndex, nod.this.zIndex))) {
            if ( m.nod.this.north.equals("O")){
                moveNorth(m.nod);
                str += "N";
                Mover(m.nod);

            }if( m.nod.this.south.equals("O") ){
                str += "S";
                Mover(m.nod);

            }if(m.nod.this.west.equals("O")){
                str += "W";
                Mover(m.nod);
            }if(m.nod.this.east.equals("O")){
                str += "E";
                Mover(m.nod);
            }if(m.nod.this.up.equals("O")){
                str += "U";
                Mover(m.nod);
            }if(m.nod.this.down.equals("O")){
                str += "D";
                Mover(m.nod);
            }
        
        }

    }
}