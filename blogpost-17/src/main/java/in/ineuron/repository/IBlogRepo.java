package in.ineuron.repository;

import java.util.List;

import in.ineuron.model.Blogpost;

public interface IBlogRepo {
	 public String saveBlog(Blogpost bp);
     public List<Blogpost> getAllBlogposts();
}
