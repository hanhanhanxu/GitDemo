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
