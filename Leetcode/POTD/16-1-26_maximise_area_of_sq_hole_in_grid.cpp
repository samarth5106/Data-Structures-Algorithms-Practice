class Solution {
public:
    int maximizeSquareHoleArea(int hztl, int vrtl, vector<int>& hBars, vector<int>& vBars) {

        sort(hBars.begin(),hBars.end());
        sort(vBars.begin(),vBars.end());

        int horznt=0;
        int hspaces=1;
        int vertl=0;
        int vspaces=1;

        int l=0;
        for(int r=1;r<hBars.size();r++){
            if(hBars[r]==hBars[r-1]+1){
                hspaces++;
            }
            else{
                horznt=max(horznt,hspaces);
                hspaces=1;
            }
        }
        horznt=max(horznt,hspaces);

        l=0;
        for(int r=1;r<vBars.size();r++){
            if(vBars[r]==vBars[r-1]+1){
                vspaces++;
            }
            else{
                vertl=max(vertl,vspaces);
                vspaces=1;
            }
        }
        vertl=max(vertl,vspaces);

        int side=min(horznt+1,vertl+1);
        return side*side;
    }
};
