function [a1,id1,n1]=insertion(a,id,n)
n1=n;
    for i=1:n
        a1(i)=a(i);
        id1(i)=id(i);
    end
pass=0;
flag=0;
m=n1;
for i=2:n
    j=i-1;
    t=a1(i);
    t1=id1(i);
    while( a1(j)>t && j>=1 )
        a1(j+1)=a1(j);
        id1(j+1)=id1(j);
        j=j-1;
        if j==0
            break
        end
    end
    a1(j+1)=t;
    id1(j+1)=t1;
end
end