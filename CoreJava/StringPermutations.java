package CoreJava;

/**
 * Created by Skatukam on 07/26/2018.
 */
public class StringPermutations {
    public static void main(String args[]){
        String string="ABC";
        int len=string.length();
        StringPermutations stringPermutations=new StringPermutations();
        stringPermutations.Permute(string,0,len-1);
    }
    public void Permute(String str,int l,int r){
        if (l==r){
            System.out.println(str);
        }
        else{
            for (int i=l;i<=r;i++){
                str=swap(str,l,i);
                Permute(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    public String swap(String a,int i,int j){
        char temp;
        char arr[]=a.toCharArray();
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
}
