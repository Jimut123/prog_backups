%function s=mysum(n) : Function to calculate s=(1)=(1+2)+....+(1+2+....+n)
function s=mysum(n)
s=0;
s1=0;
for i=1:n
    s1=s1+i;
    s=s+s1;
end
end
