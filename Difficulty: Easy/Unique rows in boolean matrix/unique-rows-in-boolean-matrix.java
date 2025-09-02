/*Complete the given function*/
class TrieNode{
    TrieNode[] Nodes=new TrieNode[2];
    boolean endofnode=false;
}

class Tries{
    private TrieNode root=new TrieNode();
    
    public void insert(int a[][],int r,int c){
        TrieNode curr=root;
        for(int i=0;i<c;i++){
            if(curr.Nodes[a[r][i]]==null)
            curr.Nodes[a[r][i]]=new TrieNode();
            curr=curr.Nodes[a[r][i]];
        }
        curr.endofnode=true;
    } 
    
    public boolean present(int a[][],int r,int c){
        TrieNode curr=root;
        for(int i=0;i<c;i++){
            if(curr.Nodes[a[r][i]]==null)
            return false;
            
            curr=curr.Nodes[a[r][i]];
        }
        return curr.endofnode;
    }
}

class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        // add code here.
        
    Tries tries=new Tries();
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<r;i++){
            if(!tries.present(a,i,c)){
                tries.insert(a,i,c);
                ArrayList<Integer> temp=new ArrayList<>();
                for(int j=0;j<c;j++){
                    temp.add(a[i][j]);
                }
                result.add(temp);
            }
        }
        
        return result;
    }
}