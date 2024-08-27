
Fiber dump from client

```
cats.effect.IOFiber@711c86d4 WAITING

cats.effect.IOFiber@6306e3db WAITING
├ map2 @ fs2.Stream$.$anonfun$45(Stream.scala:3704)
├ tryTakeN @ fs2.Stream$.fromQueueUnterminated(Stream.scala:3703)
╰ flatMap @ fs2.Stream$.fromQueueUnterminated(Stream.scala:3706)

cats.effect.IOFiber@483060a9 WAITING
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
╰ flatMap @ fs2.internal.InterruptContext.completeWhen(InterruptContext.scala:52)

cats.effect.IOFiber@2550ab17 WAITING

cats.effect.IOFiber@65dadf2f WAITING

cats.effect.IOFiber@55fcb095 WAITING

cats.effect.IOFiber@1a4ce1ec WAITING
├ map2 @ fs2.Stream$.$anonfun$45(Stream.scala:3704)
├ tryTakeN @ fs2.Stream$.fromQueueUnterminated(Stream.scala:3703)
├ flatMap @ fs2.Stream$.fromQueueUnterminated(Stream.scala:3706)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ handleErrorWith @ fs2.Compiler$Target.handleErrorWith(Compiler.scala:161)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
╰ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)

cats.effect.IOFiber@2c92e528 WAITING
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
╰ flatMap @ fs2.internal.InterruptContext.completeWhen(InterruptContext.scala:52)

cats.effect.IOFiber@45731f70 WAITING

cats.effect.IOFiber@241ba146 WAITING
├ map @ fs2.Stream.$anonfun$37(Stream.scala:2352)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
╰ flatMap @ fs2.internal.InterruptContext.completeWhen(InterruptContext.scala:52)

cats.effect.IOFiber@1bd643a4 WAITING
├ raceOutcome @ fs2.internal.InterruptContext.eval$$anonfun$1(InterruptContext.scala:91)
├ flatMap @ fs2.internal.InterruptContext.eval$$anonfun$1(InterruptContext.scala:100)
├ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)
├ flatMap @ fs2.internal.InterruptContext.eval(InterruptContext.scala:101)
├ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Pull$.goEval$1(Pull.scala:1097)
├ >>$extension @ org.typelevel.keypool.KeyPool$Builder.keepRunning$1(KeyPool.scala:371)
╰ map @ fs2.internal.InterruptContext.eval$$anonfun$1$$anonfun$1$$anonfun$3(InterruptContext.scala:96)

cats.effect.IOFiber@3b62c03 WAITING
├ void @ org.typelevel.keypool.KeyPool$.reap(KeyPool.scala:187)
├ >>$extension @ org.typelevel.keypool.KeyPool$Builder.keepRunning$1(KeyPool.scala:371)
├ >>$extension @ org.typelevel.keypool.KeyPool$Builder.keepRunning$1(KeyPool.scala:371)
├ tryModify @ org.typelevel.keypool.KeyPool$.loop$1$$anonfun$1(KeyPool.scala:209)
├ flatMap @ org.typelevel.keypool.KeyPool$.loop$1$$anonfun$1(KeyPool.scala:213)
├ map @ org.typelevel.keypool.KeyPool$.loop$1$$anonfun$1(KeyPool.scala:214)
├ flatMap @ org.typelevel.keypool.KeyPool$.loop$1(KeyPool.scala:214)
╰ void @ org.typelevel.keypool.KeyPool$.reap(KeyPool.scala:187)

cats.effect.IOFiber@8113511 WAITING

cats.effect.IOFiber@5bfea19 WAITING

cats.effect.IOFiber@79331574 WAITING
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ handleErrorWith @ fs2.Compiler$Target.handleErrorWith(Compiler.scala:161)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Pull$.goEval$1(Pull.scala:1097)
├ >>$extension @ org.typelevel.keypool.KeyPool$Builder.keepRunning$1(KeyPool.scala:371)
├ >>$extension @ org.typelevel.keypool.KeyPool$Builder.keepRunning$1(KeyPool.scala:371)
├ >>$extension @ org.typelevel.keypool.KeyPool$Builder.keepRunning$1(KeyPool.scala:371)
╰ >>$extension @ org.typelevel.keypool.KeyPool$Builder.keepRunning$1(KeyPool.scala:371)

cats.effect.IOFiber@587e351c WAITING
├ raceOutcome @ fs2.internal.InterruptContext.eval$$anonfun$1(InterruptContext.scala:91)
├ flatMap @ fs2.internal.InterruptContext.eval$$anonfun$1(InterruptContext.scala:100)
├ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)
├ flatMap @ fs2.internal.InterruptContext.eval(InterruptContext.scala:101)
├ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Pull$.goEval$1(Pull.scala:1097)
╰ map @ fs2.internal.InterruptContext.eval$$anonfun$1$$anonfun$1$$anonfun$3(InterruptContext.scala:96)

cats.effect.IOFiber@7138161b WAITING
├ main$ @ com.example.stock.ClientMain$.main(ClientMain.scala:14)
╰ flatMap @ fs2.internal.InterruptContext.childContext$$anonfun$1$$anonfun$1(InterruptContext.scala:80)

cats.effect.IOFiber@23e1257b WAITING
├ map2 @ fs2.Stream$.$anonfun$45(Stream.scala:3704)
├ tryTakeN @ fs2.Stream$.fromQueueUnterminated(Stream.scala:3703)
├ flatMap @ fs2.Stream$.fromQueueUnterminated(Stream.scala:3706)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ handleErrorWith @ fs2.Compiler$Target.handleErrorWith(Compiler.scala:161)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
╰ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)

cats.effect.IOFiber@e5aeddd WAITING
├ raceOutcome @ fs2.internal.InterruptContext.eval$$anonfun$1(InterruptContext.scala:91)
├ flatMap @ fs2.internal.InterruptContext.eval$$anonfun$1(InterruptContext.scala:100)
├ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)
├ flatMap @ fs2.internal.InterruptContext.eval(InterruptContext.scala:101)
├ get @ org.http4s.ember.core.h2.H2Client$.impl$$anonfun$1(H2Client.scala:344)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Compiler$Target.flatMap(Compiler.scala:163)
├ flatMap @ fs2.Pull$.goEval$1(Pull.scala:1097)
╰ map @ fs2.internal.InterruptContext.eval$$anonfun$1$$anonfun$1$$anonfun$3(InterruptContext.scala:96)

cats.effect.IOFiber@511053e6 WAITING
├ delay @ fs2.io.net.SocketCompanionPlatform$AsyncSocket.readChunk$$anonfun$1(SocketPlatform.scala:120)
├ async @ fs2.io.net.SocketCompanionPlatform$AsyncSocket.readChunk(SocketPlatform.scala:120)
├ flatMap @ fs2.io.net.SocketCompanionPlatform$BufferedReads.read$$anonfun$1(SocketPlatform.scala:84)
├ delay @ fs2.io.net.SocketCompanionPlatform$BufferedReads.withReadBuffer(SocketPlatform.scala:58)
├ flatten$extension @ fs2.io.net.SocketCompanionPlatform$BufferedReads.withReadBuffer(SocketPlatform.scala:58)
╰ getAndSet @ org.typelevel.keypool.KeyPool$.destroy(KeyPool.scala:120)

Thread[io-compute-3,5,main] (#3): 0 enqueued
Thread[io-compute-10,5,main] (#10): 0 enqueued
Thread[io-compute-11,5,main] (#11): 0 enqueued
Thread[io-compute-4,5,main] (#4): 0 enqueued
Thread[io-compute-2,5,main] (#2): 0 enqueued
Thread[io-compute-7,5,main] (#7): 0 enqueued
Thread[io-compute-5,5,main] (#5): 0 enqueued
Thread[io-compute-9,5,main] (#9): 0 enqueued
Thread[io-compute-6,5,main] (#6): 0 enqueued
Thread[io-compute-8,5,main] (#8): 0 enqueued
Thread[io-compute-1,5,main] (#1): 0 enqueued
Thread[io-compute-0,5,main] (#0): 0 enqueued

Global: enqueued 0, foreign 0, waiting 20

```