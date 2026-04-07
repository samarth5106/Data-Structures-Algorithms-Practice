class Solution {
public:
    int romanToInt(string s) {
        int sum=0;
       bool last_do_it=false;
        for(int l=0;l<s.length()-1;l++){
            int r=l+1;
            if(s[l]=='I'&&s[r]=='V'){
                sum+=4;
                l++;
                if(l==s.length()-2) last_do_it=true;
            }
            else if(s[l]=='I'&&s[r]=='X') {sum+=9;l++;if(l==s.length()-2) last_do_it=true;}
            else if(s[l]=='X'&&s[r]=='L') { sum+=40;l++;if(l==s.length()-2) last_do_it=true;}
            else if(s[l]=='X'&&s[r]=='C') {sum+=90;l++;if(l==s.length()-2) last_do_it=true;}
            else if(s[l]=='C'&&s[r]=='D') {sum+=400;l++;if(l==s.length()-2) last_do_it=true;}
            else if(s[l]=='C'&&s[r]=='M') {sum+=900;l++;if(l==s.length()-2) last_do_it=true;}
            else{
                if(l==s.length()-2) last_do_it=true;
                if(s[l]=='I') sum++;
                if(s[l]=='V') sum+=5;
                if(s[l]=='X') sum+=10;
                if(s[l]=='L') sum+=50;
                if(s[l]=='C') sum+=100;
                if(s[l]=='D') sum+=500;
                if(s[l]=='M') sum+=1000;
            }
        }
        if(last_do_it||s.length()==1){
            int l=s.length()-1;
            if(s[l]=='I') sum++;
                if(s[l]=='V') sum+=5;
                if(s[l]=='X') sum+=10;
                if(s[l]=='L') sum+=50;
                if(s[l]=='C') sum+=100;
                if(s[l]=='D') sum+=500;
                if(s[l]=='M') sum+=1000;

        }

        return sum;
    }
};
