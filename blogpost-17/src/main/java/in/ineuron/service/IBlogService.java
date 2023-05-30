package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Blogpost;

public interface IBlogService {
     public String saveBlog(Blogpost bp);
     public List<Blogpost> getAllBlogposts();
}
