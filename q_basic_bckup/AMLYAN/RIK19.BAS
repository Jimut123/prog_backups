REM
CLS
n$ = "YES"
WHILE (n$ = "YES" OR n$ = "yes")
PRINT "PRESS 1 FOR VOTING PULSAR SAHA"
PRINT "PRESS 2 FOR VOTING CHOTO MAMA"
PRINT "PRESS 3 FOR VOTING POPPY"
PRINT "PRESS 4 FOR DISPLAYING RESULT"
INPUT "ENTER YOUR CHOICE"; CH
IF CH = 1 THEN GOSUB 10
IF CH = 2 THEN GOSUB 20
IF CH = 3 THEN GOSUB 30
IF CH = 4 THEN GOSUB 40
INPUT "Want another"; n$
WEND
END
10 A = A + 1
RETURN
20 B = B + 1
RETURN
30 C = C + 1
RETURN
40 PRINT "VOTES GOT BY PULSAR SAHA"; A
PRINT "VOTES GOT BY CHOTO MAMA"; B
PRINT "VOTES GOT BY POPPY"; C
RETURN

