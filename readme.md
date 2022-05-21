# GitDemo
对Git rebase等操作进行实验演示



git log --graph --pretty=oneline --abbrev-commit
 

test1:正常操作

test2:在本地进行commit之后，选择rebase操作，然后再push

test3:在最终提交MR时，选择了rebase and merge，而不是create a merge   变成了一条直线。开1、2、3 三个分支重复这样的操作，发现变成了那样一条线，然后多出来分叉的线，不过分叉的线没有跟直线连起来。删除1、2、3本地分支发现，分叉的线消失了，只剩下一条直线！


test4:feature/hx分支写代码， 提交，push。     与此同时，test5:从master拉出新分支feature/ctj并写代码，push，然后rebase到了master

test4:feature/hx分支继续写代码， 提交，push。 当我准备合并代码时，我要先切换到master分支，rebase方式pull最新代码，然后切换到我的分支feature/hx，并对本地的master选择 rebase ，





git rebase origin master

在3的节点上开出hx分支和4分支。分别写代码push到各自的远程。然后4分支在远程执行rebase and merge操作。随后删除远程4分支。（4分支开发完毕）
再在落后的hx分支上开发，push，开发完成，然后本地切到master,pull最新代码，然后checkout hx，git rebase master,发现冲突了，但是冲突不对，丢失了我刚刚在hx分支上push的代码。



一次成功的多人开发rebase操作：
从master拉出qq分支、ww分支。ww分支开发创建Demo2文件，然后提交push，远程rebase and merge 到master。ww分支完成开发。
qq分支写代码，push，然后准备合到master，做例行check：rebase方式切换到master，然后pull最新代码，然后切换到qq分支，rebase master(rebase current onto selected)，然后push到远程(push被rejected拒绝时，选择rebase)，在远程rebase and merge到master，qq分支完成开发。
最后切回master，把其他两个本地分支删除了，查看记录，是一条直线：ww qq两次提交。






//所有提交变成了一条直线，每个提交上面只有他当次真实的修改。

回顾下刚刚的操作：
从master上面拉出aabranch和bbbranch，模拟两个人开发。
bbbranch编写代码， 提交并push，在远程rebase方式合并到master，bb的开发工作完成了。（刚刚演示时为了快速看效果其实有点不严谨，bb在远程创建PR进行合并时，要先在本地rebase最新的master，但是我知道master没有其他提交，所以这一步我没有做）

aabranch编写代码，提交并push，然后他想合并到master，就必须现在本地rebase下最新的master。所以先在本地切到master，并pull最新代码，发现有新代码，就切到自己的aabranch分支，然后rebase master，接着push到远程，
然后再在远程提交PR进行rebase master的操作。最后aa的开发工作也完成了。

最后我们切回master拉取最新代码，把其他分支都删除掉，发现master上的提交记录就是一条直线，并且没有多余的merge branch的那些提交记录。




用git命令:
git branch
* master

git checkout -b iu
git checkout master
git checkout -b lf

git add.
git commit -m "lf"
git push origin lf
git checkout master
git pull --rebase (Already up to datte.发现没有可更新的，那就直接远程rebase and merge)
(远程rebase and merge成功，删除远程和本地的lf分支)

git checkout iu
git add .
git commit -m "iu's code"
git push origin iu
git checkout master
git pull --rebase(发现有更新)

git checkout iu
git rebase master(Successfully rebased and updated refs/heads/iu.)
git push origin iu -f(一定要强制推送，不然推不上去)
(推上去后在远程提交PR，rebase and merge方式合并，合并成功)

git checkout master
git branch -D iu
git log --graph --pretty=oneline --abbrev-commit
