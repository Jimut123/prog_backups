%Calculate pi
function [s]=calcPI()
den=1;
prev=1;
i=1;
base=3;
s=1;
while(1)
    den=1;
    for j=1:i
        den=den*3;
    end
    den=den*base;
    if (mod(i,2)~=0)
    s=s-1/(den);
    else
    s=s+1/den;
    end
    base=base+2;
    i=i+1;
    h=s-prev;
    prev=s;
    if(h<0)
        h=-h;
    end
    if(h<1e-10)
        break;
    end
end
s=s*2*sqrt(3);
fprintf('Value of PI is: %16.12f',s);
end
 
    
    
    
    
    
    
   
    