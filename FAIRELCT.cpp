#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n, m;
	    cin>>n>>m;
	    int a[n];
	    int b[m];
	    
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	    
	    for(int i=0;i<m;i++)
	        cin>>b[i];
	    
	    int sa=0, sb=0, t, swap = 0;
        int flag = 0;
        
        sa = accumulate(a, a+n, 0);
        sb = accumulate(b, b+m, 0);
        
	    while(sa <= sb)
	    {
	        sort(a, a+n);
	        sort(b, b+m);
	        if(a[0] < b[m-1])
	        {
	            swap++;
	            t = a[0];
	            a[0] = b[m-1];
	            b[m-1] = t;
	        }
	        else if(a[0] >= b[m-1])
	        {
	            flag = 1;
	            cout<<-1<<endl;
	            break;
	        }
            sa = accumulate(a, a+n, 0);
            sb = accumulate(b, b+m, 0);
	    }
	    
	    if(flag == 0)
	        cout<<swap<<endl;
	}
	return 0;
}

