function [n]=hanoi(p1,p2,p3,nd)
global n; 
if nd==1
    n=n+1;
    fprintf('Move disk  %d from peg %d to peg %d\n', nd, p1,p2);
    return;
end
hanoi(p1,p3,p2,nd-1);
n=n+1;
fprintf('Move disk %d from peg %d to peg %d\n', nd, p1,p2);
hanoi(p3,p2,p1,nd-1);
end 
