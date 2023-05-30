package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Blogpost;
import in.ineuron.repository.BlogRepoImpl;
import in.ineuron.repository.IBlogRepo;

public class BlogServiceImpl implements IBlogService {

	IBlogRepo repo=new BlogRepoImpl();
	@Override
	public String saveBlog(Blogpost bp) {
		// TODO Auto-generated method stub
		return repo.saveBlog(bp);
	}

	@Override
	public List<Blogpost> getAllBlogposts() {
		// TODO Auto-generated method stub
		return repo.getAllBlogposts();
	}

}
