.class public UTL
.super java/lang/Object
    
.field public balance Ljava/lang/Integer;
.field public tick_counts Ljava/lang/Integer;
    
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method
    
.method public OnInit(LTrade;)V
.limit stack 128
.limit locals 128
    new Order
    dup
    ldc "SELL"
    ldc 100
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    ldc 100
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    ldc 10
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    invokespecial Order/<init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    astore_2
    return
.end method
    
.method public OnInit(LTrade;)V
.limit stack 128
.limit locals 128
    new Order
    dup
    ldc "BUY"
    ldc 200
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    ldc 50
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    ldc 5
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    invokespecial Order/<init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    astore_2
    new Order
    dup
    ldc "SELL"
    ldc 100
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    ldc 100
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    ldc 10
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    invokespecial Order/<init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    astore_3
    return
.end method
    
.method public OnStart(LTrade;)V
.limit stack 128
.limit locals 128
    aload_1
    invokevirtual LTrade/getBid()F
    astore_2
    aload_1
    invokevirtual LTrade/getAsk()F
    astore_3
    ldc 100
    astore 4
    ldc 250
    astore 5
    ldc 20
    astore 6
    new Order
    dup
    ldc "BUY"
    aload 4
    invokevirtual java/lang/Float/floatValue()F
    f2i
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    aload 5
    invokevirtual java/lang/Float/floatValue()F
    f2i
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    aload 6
    invokevirtual java/lang/Float/floatValue()F
    f2i
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    invokespecial Order/<init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    astore 7
    aload 5
    invokevirtual java/lang/Float/floatValue()F
    aload 6
    invokevirtual java/lang/Float/floatValue()F
    fdiv
    astore 8
    return
.end method
    
.method public OnStart(LTrade;)V
.limit stack 128
.limit locals 128
    aload_0
    ldc 100
    invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
    invokevirtual LYourClass/GetCandle(Ljava/lang/Integer;)V
    return
.end method
    
.method public main()V
.limit stack 128
.limit locals 128
    ldc "admin"
    astore_1
    aload_0
    aload_1
    ldc "password"
    invokevirtual LYourClass/Connect(Ljava/lang/String;Ljava/lang/String;)V
    aload_0
    ldc "USDETH"
    invokevirtual LYourClass/Observe(Ljava/lang/String;)LTrade;
    astore_2
    aload_0
    ldc "IRRETH"
    invokevirtual LYourClass/Observe(Ljava/lang/String;)LTrade;
    astore_3
    return
.end method
    
