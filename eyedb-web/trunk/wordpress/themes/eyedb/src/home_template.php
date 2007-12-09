<?php
/*
Template Name: HomeTemplate
*/
?>
<?php get_header(); ?>

<div id="static">

<?php if (have_posts()) : while (have_posts()) : the_post(); ?>
<div class="entrytext">
<?php the_content('<p class="serif">Read the rest of this page &raquo;</p>'); ?>
<?php link_pages('<p><strong>Pages:</strong> ', '</p>', 'number'); ?>
</div>
<?php endwhile; endif; ?>
	
</div>

<?php query_posts('category_name=News'); ?>

<?php if (have_posts()) : echo '<h2>' . __('News') . '</h2>'; while (have_posts()) : the_post(); ?>
<div id="News">
<h3 class="storytitle"><a href="<?php the_permalink() ?>"><?php the_title(); ?></a></h3>
<div class="storycontent">
<?php the_content(__('(Read on ...)')); ?>
</div>
</div>
<?php endwhile; endif; ?>

<?php get_footer(); ?>